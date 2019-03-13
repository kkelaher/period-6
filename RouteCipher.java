/**
 * AP FRQ 2011 #4.
 *
 * @author (your name)
 * @version 3/12/19
 */
public class RouteCipher
{
    private String [][] letterBlock;
    private int numRows;
    private int numCols;
    
    public RouteCipher(int r, int c)
    {
        numRows = r;
        numCols = c;
        letterBlock = new String[numRows][numCols];
    }
    
    // Write part (a) here
    private void fillBlock(String str)
    {
        int x = 0;
        for (int i = 0; i < numRows; i ++)
        {
            for (int j = 0; j < numCols; j ++)
            {
                if(x < str.length())
                {
                    letterBlock[i][j] = str.substring(x, x + 1);
                }
                else
                {
                    letterBlock[i][j] = "A";
                }
                x ++;
            }
        }
    }
    
    private String encryptBlock()
    {
        String message = "";
        
        for (int col = 0; col < letterBlock[0].length; col++)
        {
            for (int row = 0; row < letterBlock.length; row++)
            {
                message += letterBlock[row][col];
            }
        }
        
        return message;
    }
    
    // Write part (b) here
    public String encryptMessage(String message)
    {
        String finalString = "";
        
        while(message.length() > 0)
        {
            int spaces = numRows * numCols;
            if (spaces>message.length())
            {
                spaces = message.length();
            }
            fillBlock(message.substring(0, spaces));
            finalString += encryptBlock();
            message = message.substring(spaces);
        }
        return finalString;
    }
    
    public static void main (String [] args)
    {
        RouteCipher a = new RouteCipher(3, 5);
        
        //First example for part (a)
        a.fillBlock("Meet at noon");
        a.showBlock();
        System.out.println();
        
        //Second example for part (a)
        a.fillBlock("Meet at midnight");
        a.showBlock();
        System.out.println();
        
        //Example for part (b)
        RouteCipher b = new RouteCipher(2, 3);
        System.out.println(b.encryptMessage("Meet at midnight"));
    }
    
    public void showBlock()
    {
        for (String [] r: letterBlock)
        {
            for (String c: r)
            {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}



