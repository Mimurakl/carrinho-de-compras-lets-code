package com.squad.vermelho;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        PessoaFisica p1 = new PessoaFisica("R2D2", "00431291", "r2d2@teste.com", "1625615", "Rua 121872, CASA 17682", LocalDate.of(1996, 10, 15));

        System.out.println(p1);
    }
}
