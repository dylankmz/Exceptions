package be.jadv;

import be.jadv.execptions.GeenWoordException;
import be.jadv.tools.Sorteerder;

public class Main {

    public static void main(String[] args) {
        String str1 = "", str2 = "Kiwi";

        Sorteerder sortz = new Sorteerder();
        boolean isAlpha = false;
        try {
            isAlpha = Sorteerder.alfabetisch(str1,str2);
        } catch (GeenWoordException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        if (isAlpha) {
            System.out.println("OMG het is alfabetisch");
        } else {
            System.out.println("HAHA het is niet alfabetisch");
        }
    }
}
