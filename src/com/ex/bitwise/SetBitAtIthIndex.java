package com.ex.bitwise;

public class SetBitAtIthIndex {
    public static void main(String[] args) {
        byte b = (byte) 10001;
        int index =3;
        setBit(b,index);
    }

    private static void setBit(byte b, int index) {
        b = (byte) (b & (1 << (index -1)));
        System.out.println(b);
    }
}
