import java.util.StringTokenizer;

public class ExceptionDemo3 {
    public static void main(String[] args) throws HistoryException{ //throws를 하거나 try catch를 하거나
        Student chulsu = new Student();
            chulsu.setKor(120);
            System.out.println(chulsu); //chulsu.toString()
    }
}

class HistoryException extends Exception { //Checked Exception
    public HistoryException(String msg) {
        super(msg);
    }
}

class KoreanException extends RuntimeException { //Unchecked Exception
    public KoreanException(String msg) {
        super(msg);
    }
}

class Student {
    private int kor;
    private int history;

    public void setHistory(int history) throws HistoryException{
        if (history >= 0 && history <= 100) {
            this.history = history;
        } else {
            throw new HistoryException("국어 점수는 0부터 100까지의 범위만 인정합니다");
        }
    }

        public void setKor /*throws KoreanException*/(int kor){ //checked exception의 경우 throws로 Exception선언을 해줘야한다
            if (kor >= 0 && kor <= 100) {
                this.kor = kor;
            } else {
                throw new KoreanException("국어 점수는 0부터 100까지의 범위만 인정합니다");
                //throw는 내가 exception을 유발시키는 것이고 throws는 메서드 도입부에 exception을 선언하는 것
            }
        }

        @Override
        public String toString () {
            return "kor = " + this.kor + ", history = " + history;
        }
    }
}