package sort.secondsort;

class Code implements Comparable<Code> {
    private String MainCode;

    public Code(String mainCode) {
        MainCode = mainCode;
    }

    public String getMainCode() {
        return MainCode;
    }

    public void setMainCode(String mainCode) {
        MainCode = mainCode;
    }

    @Override
    public String toString() {
        return MainCode ;
    }

    @Override
    public int compareTo(Code o) {
        return  this.getMainCode().compareTo(o.getMainCode());
    }

}
