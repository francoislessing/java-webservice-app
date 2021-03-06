/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.sample.util;

import io.swagger.sample.resource.SatelliteResource;
import java.security.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
//import java.security.spec.*;
//import javax.crypto.*;
//import javax.crypto.spec.*;
import javax.ws.rs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author francois
 */
public class SecurityQueryParams {
  static Logger logger = LoggerFactory.getLogger(SatelliteResource.class);
  
  
  private String dateTime;

  
  private String userName;

  
  private String apiKey;

  public SecurityQueryParams(String token){
      // Split token
      String remainder = token.substring(token.indexOf(':')+1);
      logger.debug("Remainder "+remainder);
      this.dateTime = token.substring(0,token.indexOf(':')-1);
      logger.debug("dateTime "+this.dateTime);
      this.userName = remainder.substring(0,remainder.indexOf(':'));
      logger.debug("userName "+this.userName);
      this.apiKey = remainder.substring(remainder.indexOf(':')+1);
      logger.debug("apiKey "+this.apiKey);      
      
      String compositeToken = this.dateTime +"-"+ this.userName + "-" + this.apiKey;
      logger.debug("Split  ==  "+compositeToken);      
  }
  
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getDateTime() {
    return apiKey;
  }
  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }
  
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

private String get_SHA_512_SecurePassword(String passwordToHash, String   salt){
String generatedPassword = null;
    try {
         MessageDigest md = MessageDigest.getInstance("SHA-512");
         md.update(salt.getBytes(StandardCharsets.UTF_8));
         byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
         generatedPassword = Base64.getEncoder().encodeToString(bytes);
//         StringBuilder sb = new StringBuilder();
//         for(int i=0; i< bytes.length ;i++){
//            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
//         }
//         generatedPassword = sb.toString();           
        } 
       catch (NoSuchAlgorithmException e){
        e.printStackTrace();
       }
    return generatedPassword;
}  
  
  private String createHash(String clearText) {

    byte[] salt ={1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6}; //= new byte[16]

    
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-512");          

        byte[] hashedPassword = md.digest(clearText.getBytes(StandardCharsets.UTF_8));
        byte[] encodedHash = Base64.getEncoder().encode(hashedPassword);
        return(encodedHash.toString()); 
    } catch (java.lang.Exception e){
        logger.error(e.toString());
        return("");
    }
    
    
  }
  
  public boolean compareTokens(String localDateTime){
      // Lookup password from user name
      String password = "WEROIU&(34KHJFDSfdkljewr98734";
      // Check that time provided is close to Local Date Time
      
      // Calculate hash from time username and password
      String compositeToken = localDateTime +":"+ this.userName + ":" + password;
      String hash = get_SHA_512_SecurePassword(compositeToken,"1234567890");
      logger.debug("Token : hash  ::: "+compositeToken+" = "+hash);
      
      if(this.apiKey.equals(hash) ){
        return true;    
      }
      
      return false;
  }
}
