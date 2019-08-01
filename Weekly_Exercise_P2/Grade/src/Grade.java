/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LIANNE
 */
public class Grade
{
    private int percentage;
    public Grade (int percentage)
    {
        this.percentage = percentage;
    }
    
    public int getPercentage()
    {
        return percentage;
        
    }
    public void setPercentage(int p)
    {
        if ((percentage >=0)&& (percentage <= 100))
        {
            this.percentage =p;
        }
        else 
        {
            this.percentage = 0;
        }
    }
}
