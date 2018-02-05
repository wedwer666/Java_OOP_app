/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_OOP_s;

/**
 *
 * @author Maria
 */
public class Second_class {
    // all data about courses where student is involved
    public double math;
    public double informatics;
    public double phizics;
    public double dis_math;
    public double geography; 
    public double economics;
    public double appoo;
    public double assembler;
    public double mobile_develop;
    // all data about marks that student recieved in his/her studies
    public double nota_1;
    public double nota_2;
    public double nota_3;
    public double nota_4;
    // final marks for every student
    public double nota_totala_1;
    public double nota_totala_2;
    public double nota_totala_3;
            
    public double get_data_1()
    {
        nota_totala_1 = math + informatics + phizics;
        return nota_1;
        
    }
    public double get_data_2()
    {
        nota_totala_2 = dis_math + geography + economics;
        return nota_2;
    }
    public double get_data_3()
    {
        nota_totala_3 = appoo + assembler + mobile_develop;
        return nota_3;
    }
      //part of the code where INHERITANCE IS IMPLEMEMENTED
    public class First_class extends Second_class
    {
        
    }
}

