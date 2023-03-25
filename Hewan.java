package Modul;

import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class Hewan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");System.out.print("Hewan = ");
            System.out.println(hewan);
        
        ArrayList<String> deleteHewan = new ArrayList<>();
            deleteHewan.add("Kelinci");
            deleteHewan.add("Kambing");
            deleteHewan.add("Unta");
            ArrayList<String> deletedData = new ArrayList<>();

            for (String delete : deleteHewan) {
                hewan.removeIf(h -> h.equals(delete));
                deletedData.add(delete);
            }

            System.out.println("\nHewan yang dihapus : ");
            System.out.println(deletedData);
            System.out.println("\nOutput Hewan Setelah DiHapus : ");
            System.out.println(hewan);
        }
    }
