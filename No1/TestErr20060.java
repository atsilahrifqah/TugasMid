/*Nama: Atsilah Rifqah Wardani*/
/*Nim: 13020210060*/
/*Kelas: B1*/

public class TestErr20060 {
    public static void main(String[] args) {
        int tot = 0;
        int i;
        int j = 0;
        for (i = 0; i < 10; i++) {
            tot += i;
        if (i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
}
        do {
            j++;
        } while (j < 10);
        while (j < 10) {
            j++;
        }
    }
}
