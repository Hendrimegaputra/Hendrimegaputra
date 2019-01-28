/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classrumus;

import static jdk.nashorn.internal.objects.NativeRegExp.test;

/**
 *
 * @author DiahMaelani
 */
public class Rumus {
     public int xrumus(int a) {
         int i = Integer.valueOf(a);
         String hitung = Integer.toBinaryString(i);
         int binary = Integer.valueOf(hitung);
        return binary;
    }
    
    public String xrumus(String a) {
        int angka = Integer.parseInt(a);
        String hexadesimal = Integer.toHexString(angka);
        return hexadesimal;
    }
}