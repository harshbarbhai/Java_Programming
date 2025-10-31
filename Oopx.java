class Arithematic
{
    public int ino1;
    public int ino2;

    public Arithematic()
    {
        this.ino1 = 0;
        this.ino2 = 0;
    }

    public Arithematic(int i, int j)
    {
        this.ino1 = i;
        this.ino2 = j;
    }

    public int Addition()  // Fixed typo: Addittion -> Addition
    {
        int ians=0;
        ians=this.ino1 + this.ino2;
        return ians;
    }

    public int Subtraction()  // Fixed typo: Substraction -> Subtraction
    {
        int ians=0;
        ians=this.ino1 - this.ino2;
        return ians;

    }
}


    class Oopx {
    public static void main(String[] args) {

        // your logic here
        int iret=0;

        Arithematic aboj1 = new Arithematic(11, 10);
        iret = aboj1.Addition();
        System.out.println("Addition is " + iret);

        iret = aboj1.Subtraction();
        System.out.println("Subtraction is " + iret);

        aboj1 = null;
    }
}
