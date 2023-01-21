/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class HomePage {
    private Scanner input = new Scanner(System.in);
    private BukuPage bukuPage;

    public HomePage() {
        bukuPage = new BukuPage();
        initialPage();
    }

    private void initialPage() {
        System.out.println("=======================================");
        System.out.println("--------------- LIBRARY ---------------");
        System.out.println("=======================================");
        int menu;
        do {
            System.out.println("MENU");
                    System.out.println("1. Lihat Data");
                    System.out.println("2. Tambah Data");
                    System.out.println("3. Edit Data");
                    System.out.println("4. Hapus Data");
                    System.out.println("0. Keluar");
                    System.out.print("Pilih: ");
            System.out.print("Pilih Menu: ");
            menu = input.nextInt();

            System.out.println();
            
            switchMenu(menu);
        } while (menu != 0);
    }

    private void switchMenu(int menu) {
        switch (menu) {
            case 1:
                bukuPage.lihatBuku();
                break;
            case 2:
                bukuPage.tambahBuku();
                break;

            case 3:
                bukuPage.editBuku();
                break;

            case 4:
                bukuPage.hapusBuku();
                break;

            default:
                System.out.println("Menu Tidak Valid!");
                break;
        }
    }
}

