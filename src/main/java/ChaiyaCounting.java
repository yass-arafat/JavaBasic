/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yassir Arafat
 */
public class ChaiyaCounting {

    public static void main(String[] args) {

        int chaiyaStart = 0;
        int count = 0;

        String song = "Jinke sar ho ishq ki chaaon\n"
                + "Paaon ke neeche jaanat hogi\n"
                + "Jinke sar ho ishq ki chaaon\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Saare ishq ki chhaaon chal chaiyya chaiyya\n"
                + "Saare ishq ki chhaaon chal chaiyya\n"
                + "\n"
                + "Pau janat chale chal chaiyya chaiyya\n"
                + "Pau janat chale chal chaiyya\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Voh yaar hai jo khushboo ki tarah\n"
                + "Voh jiski zubaan urdu ki tarah\n"
                + "\n"
                + "Meri shaam raat, meri kaayanat\n"
                + "Voh yaar mera sainya sainya\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Gulposh kabhi itraaye kahin\n"
                + "Mehke to nazar aa jaaye kahin\n"
                + "Gulposh kabhi itraaye kahin\n"
                + "Mehke to nazar aa jaaye kahin\n"
                + "\n"
                + "Taaveez banaake pehnoon usay\n"
                + "Aayat ki tarah mil jaaye kahin\n"
                + "Taaveez banaake pehnoon usay\n"
                + "Aayat ki tarah mil jaaye kahin\n"
                + "Gulposh kabhi itraaye kahin\n"
                + "Mehke to nazar aa jaaye kahin\n"
                + "\n"
                + "Taaveez banaake pehnoon usay\n"
                + "Aayat ki tarah mil jaaye kahin\n"
                + "\n"
                + "Voh yaar hai jo imaan ki tarah\n"
                + "Mera nagma vohi mera qalma vohi\n"
                + "Mera nagma nagma mera qalma qalma\n"
                + "\n"
                + "Mera nagma nagma mera Qalma Qalma\n"
                + "Mera nagma nagma mera Qalma Qalma\n"
                + "Mera nagma nagma mera Qalma Qalma\n"
                + "\n"
                + "Yaar misaale ous dhale\n"
                + "Paaon ke tale firdous chale\n"
                + "Kabhi daal daal kabhi paat paat\n"
                + "Main hava pe dhoondhoon uske nishaan\n"
                + "\n"
                + "Saare ishq ki chaaon chal chaiyya chaiyya\n"
                + "Saare ishq ki chaaon chal chaiyya\n"
                + "Pau janat chale chal chaiyya chaiyya\n"
                + "Pau janat chale chal chaiyya\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Main uske roop ka shehdaai\n"
                + "Vo dhoop chhanv se harjaai\n"
                + "Vo shokh hai rang badalta hai\n"
                + "Main rangroop ka saudaai\n"
                + "\n"
                + "Main rangroop ka saudaai\n"
                + "\n"
                + "Jinke sar ko ishq ki chhaaon\n"
                + "Paaon ke neeche jannat hogi\n"
                + "Jinke sar ko ishq ki chhaaon\n"
                + "Paaon ke neeche jannat hogi\n"
                + "Shaam raat meri kaaynaat\n"
                + "Vo yaar mera sainya sainya\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Saare ishq ki chaaon chal chaiyya chaiyya\n"
                + "Saare ishq ki chaaon chal chhaiya\n"
                + "Pau janat chale chal chaiyya chaiyya\n"
                + "Pau janat chale chal chaiyya\n"
                + "\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "Chal chaiyya chaiyya chaiyya chaiyya\n"
                + "\n"
                + "Voh yaar hai jo khushboo ki tarah\n"
                + "Voh jiski zubaan urdu ki tarah\n"
                + "Meri shaam raat, meri kaayanat\n"
                + "Voh yaar mera saiyya saiyya";
        for (char c : song.toCharArray()) {
            if (c == 'c' && chaiyaStart == 0) {
                chaiyaStart++;
            }
            if (c == 'h' && chaiyaStart == 1) {
                chaiyaStart++;
            }
            if (c == 'a' && chaiyaStart == 2) {
                chaiyaStart++;
            }
            if (c == 'i' && chaiyaStart == 3) {
                chaiyaStart++;
            }
            if (c == 'y' && chaiyaStart == 4) {
                chaiyaStart++;
            }
            if (c == 'y' && chaiyaStart == 5) {
                chaiyaStart++;
            }
            if (c == 'a' && chaiyaStart == 6) {
                chaiyaStart++;
            }

            if (chaiyaStart == 6) {
                count++;
                chaiyaStart = 0;
            }

        }
        System.out.println("Ans is = " + count);
    }
}
