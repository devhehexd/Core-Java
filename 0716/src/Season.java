/*
@author Gibeom
@version 1.0.0
@since jdk 17
 */
public enum Season { //주로 switch문과 사용

    spring(5), summer(100), fall(1000), winter(30_000_000); //enum 상수가 항상 제일 먼저 와야함

    private int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
