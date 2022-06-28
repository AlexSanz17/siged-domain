package com.btg.ositran.siged.domain.utils;

import java.io.IOException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
public class Test {

    public static void main(String[] args) {
    	
    	FTPClient ftpClient = new FTPClient();
    	
        try {
            ftpClient.connect("www.sofisisperu.com");
            ftpClient.login("sofisisp", "6nFd24adT0");
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            File sourceFile = new File("\\\\WWWD4\\Documentos\\Firmados\\2022001313_ANX_PRUEBA.01.pdf");
            InputStream inputStream = new FileInputStream(sourceFile);

            boolean done = ftpClient.storeFile("prueba.pdf", inputStream);
            inputStream.close();
            if (done) {
//                LOGGER.info("file is uploaded successfully..............");
            	System.out.println("file is uploaded successfully..............");
            }

        } catch (IOException e) {
        	e.printStackTrace();
//            LOGGER.error("Exception occured while ftp : "+e);
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException e) {
            	e.printStackTrace();
//                LOGGER.error("Exception occured while ftp logout/disconnect : "+e);
            }
        }
       
    }
}
