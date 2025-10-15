import java.util.Scanner;

public class SistemKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== INPUT DATA MAHASISWA =====
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

         // ---- Mata Kuliah 1 ----
        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        // ---- Mata Kuliah 2 ----
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        // ===== PERHITUNGAN NILAI AKHIR =====
        double akhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        double akhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);

        String huruf1 = "";
        String huruf2 = "";
        String status1 = "";
        String status2 = "";

        // ===== KONVERSI NILAI HURUF DAN STATUS MATA KULIAH 1 =====
        if (akhir1 >= 80 && akhir1 <= 100) huruf1 = "A";
        else if (akhir1 >= 73) huruf1 = "B+";
        else if (akhir1 >= 65) huruf1 = "B";
        else if (akhir1 >= 60) huruf1 = "C+";
        else if (akhir1 >= 50) huruf1 = "C";
        else if (akhir1 >= 39) huruf1 = "D";
        else huruf1 = "E";

        if (akhir1 >= 60)
            status1 = "LULUS";
        else
            status1 = "TIDAK LULUS";

        // ===== KONVERSI NILAI HURUF DAN STATUS MATA KULIAH 2 =====
        if (akhir2 >= 80 && akhir2 <= 100) huruf2 = "A";
        else if (akhir2 >= 73) huruf2 = "B+";
        else if (akhir2 >= 65) huruf2 = "B";
        else if (akhir2 >= 60) huruf2 = "C+";
        else if (akhir2 >= 50) huruf2 = "C";
        else if (akhir2 >= 39) huruf2 = "D";
        else huruf2 = "E";

        if (akhir2 >= 60)
            status2 = "LULUS";
        else
            status2 = "TIDAK LULUS";

             // ===== NESTED IF UNTUK STATUS SEMESTER =====
        double rata = (akhir1 + akhir2) / 2;
        String statusSemester = "";

        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rata >= 70)
                statusSemester = "LULUS";
            else
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        } else {
            statusSemester = "TIDAK LULUS (Ada mata kuliah tidak lulus)";
        }

         // ===== OUTPUT HASIL =====
        System.out.println("\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-25s %-6s %-6s %-6s %-10s %-8s %-12s\n", 
                          "Mata Kuliah", "UTS", "UAS", "Tugas", "Akhir", "Huruf", "Status");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-25s %-6.0f %-6.0f %-6.0f %-10.2f %-8s %-12s\n", 
                          "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, huruf1, status1);
        System.out.printf("%-25s %-6.0f %-6.0f %-6.0f %-10.2f %-8s %-12s\n", 
                          "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rata);
        System.out.println("Status Semester: " + statusSemester);
    }
}



