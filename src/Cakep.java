import java.util.Scanner;

/**
 *
 * @author Diva Sabila Ramadhan 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : program ini untuk menyatak bahwa apakah anda mengerjakan latihan
 * 17 sampai 30 ini sendiri?
 */
public class Cakep {

    final Scanner scan = new Scanner(System.in);
    String color[] = {"\033[38;2;255;0;0m", "\033[38;2;71;81;255m", "\033[38;2;255;255;0m", "\033[38;2;255;0;255m", "\033[38;2;0;255;0m", "\033[38;2;0;255;255m"};
    String netral = "\033[0m";
    String jawab;
    
    public void masukkanJawaban(){
        System.out.println(color[0].concat("Kamu").concat(color[4]).concat("Ngerjain Sendiri")
        .concat(color[2]).concat("Latihan 17 sampai").concat(color[1]).concat("Latihan 30 Ini"));
        
        System.out.println(color[1].concat("Jawab").concat(color[0]).concat("(Iya/Engga) :"));
        jawab = scan.next().toUpperCase();   
    }
    
    public void tampilJawaban(){
        String jawab = null;
        if(this.jawab.equals("YOI")){
            jawab = color[0].concat("\nCakep Bener. ").concat(color[3]).concat("Good Job");        
        }else if(this.jawab.equals("Engga")){
            jawab = color[0].concat("Tetep cakep sih.\n").concat(color[5]).concat("Sing penting paham ye.\n")
                    .concat(netral).concat("Keep the code works dude");
        }
        System.out.print(jawab);
    }
    
    public static void main(String[] args) {
        Cakep data = new Cakep ();
        data.masukkanJawaban();
        data.tampilJawaban();
        System.out.println("Develooped by : Diva Sabila Ramadhan");
    }
    
}
