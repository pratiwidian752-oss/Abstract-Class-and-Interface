package abstract_class;

public class Abstract_class {
    public static void main(String[] args){
        SegiEmpat se = new SegiEmpat();
        se.lebar = 10;
        se.panjang = 10;
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas sebelum diperbesar =" + se.luas);
        System.out.println("Keliling sebelum diperbesar =" + se.keliling);
        se.perbesar();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperbesar = "+ se.luas);
        System.out.println("Keliling setelah diperbesar = "+ se.keliling);
        se.perkecil();
        se.hitungKeliling();
        se.hitungLuas();
        System.out.println("Luas setelah diperkecil = "+ se.luas);
        System.out.println("Keliling setelah diperkecil = "+ se.keliling);
        
        System.out.println();
    }
}