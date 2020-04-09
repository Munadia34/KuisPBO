
package inputnilai;

public class Nilai{

    public float getratarata(float nilai1, float nilai2){//menghitung rata2 dari nilai
        return (nilai1+nilai2)/2;
    }
    
    public String getconvertNilai(float mean){//mengconvert nilai 
        if(mean >= 80 && mean <= 100) return "A";
        else if (mean >= 75) return "B+";
        else if (mean >= 65) return "B";
        else if (mean >= 60) return "C+";
        else if (mean >= 50) return "C";
        else if (mean >= 20) return "D";
        else if (mean >= 0) return "E";
        else return "Error";
    }

}
