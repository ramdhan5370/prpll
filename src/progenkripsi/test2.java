/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package progenkripsi;

/**
 *
 * @author Ramdhan Suseto
 */
public class test2 {
    public String enkrip(String key, String plaintext){
        String isi = (key.length())+key+plaintext;
        String out = "";
    for(int i=0; i<isi.length(); i++){
        int index = isi.charAt(i);
        char s = (char)(index+1);
        out = out+String.valueOf(s);
    }
    return out;
    }
}
