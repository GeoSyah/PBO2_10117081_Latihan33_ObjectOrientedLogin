/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan33_login;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Kelas tambahan untuk program utama dengan berisikan
 * akun pengguna
 */
    public class User {
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        statusAkun = false;
        if (parUserName.equals(username) && parPassword.equals(password))
            statusAkun = true;
        return statusAkun;
    }
    private void hasilLogin(boolean status, String parUserName){
        this.cekAkun(parUserName, password);
        status=this.statusAkun;
        if(status==true){
        System.out.println("*******HALLO "+parUserName.toUpperCase()+" ******");
        System.out.println("Selamat Datang di Aplikasi ini");
        }
        else{
            System.out.println("Ooops, Username atau Password salah");
        }
        
    }
    public void pengecekanLogin(String parUserName, String parPassword){
        this.cekAkun(parUserName, parPassword);
        this.hasilLogin(statusAkun, parUserName);
        
    }
    
}
