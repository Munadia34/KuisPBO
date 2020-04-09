
package inputnilai;


public class OutputData extends Nilai {//untuk menampilkan data
    public void data(int nim, String nama, String matkul1, String matkul2){
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Mata Kuliah 1 : " + matkul1);
        System.out.println("Mata Kuliah 2 : " + matkul2);
    }
}