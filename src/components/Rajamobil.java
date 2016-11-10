/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package components;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author $Teguh Kristianto
 */
public class Rajamobil {
    public String md5(String md5) throws NoSuchAlgorithmException{
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(md5.getBytes());
	byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
	}
        return sb.toString();
    }
}
