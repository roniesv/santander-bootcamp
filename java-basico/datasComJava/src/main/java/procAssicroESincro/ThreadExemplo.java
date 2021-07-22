package procAssicroESincro;

public class ThreadExemplo{
    public static void main(String[] args) {
     /*   1 forma de iniciar as Threads
        BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();*/

       /* 2 exemplo

       Thread thread = new Thread(new BarraDeCarregamento2());
        Thread thread2 = new Thread(new BarraDeCarregamento3());

        thread.start();
        thread2.start();
        System.out.println("Nome da Thread : "+thread.getName());
        System.out.println("Nome da Thread2 : "+thread2.getName());*/

        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        iniciarBarraDeCarregamento.start();


    }
}
class GeradorPDF extends Thread{
    //mais metodos e estaticos tbm
    @Override
    public void run() {
        try {
            System.out.print("Iniciar geracao de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gerar PDF");
    }
}
/* 1 forma
class GeradorPDF implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar PDF");
    }
}*/

class BarraDeCarregamento extends Thread {
    private final Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf) {
        this.iniciarGeradorPdf = iniciarGeradorPdf;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                if (!iniciarGeradorPdf.isAlive()) {
                    break;
                }
                System.out.println("Loading ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
/* 2 parte
class BarraDeCarregamento2 implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println("Rodei BarraDeCarregamento2 ");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class BarraDeCarregamento3 implements Runnable {
    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            System.out.println("Rodei BarraDeCarregamento3 ");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}*/

/* 1 forma de criar Threads

class BarraDeCarregamento2 extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(3000);
            System.out.println("Rodei BarraDeCarregamento2 "+this.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class BarraDeCarregamento3 extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(1000);
            System.out.println("Rodei BarraDeCarregamento3 "+this.getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}*/
