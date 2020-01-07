package be.jadv.tools;

import be.jadv.execptions.GeenWoordException;

public class Sorteerder {

    public static boolean alfabetisch(String woord1, String woord2) throws GeenWoordException {

        if (woord1.isEmpty() || woord2.isEmpty()) {
            throw new GeenWoordException("Parameter fout: het woord is leeg");
        }
        return woord1.compareTo(woord2) <= 0;
    }

}
