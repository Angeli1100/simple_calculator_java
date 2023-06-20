import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MCG_Calculator1 {
    private JPanel mainpanel;
    private JButton MULTIPLICATION2X2Button;
    private JButton INVERSEButton;
    private JButton SUMOFV1ANDButton;
    private JButton MULTIPLICATION3X3Button;
    private JButton DETERMINANT2X2Button;
    private JButton SCALARButton;
    private JButton ADDITION2X2Button;
    private JButton DETERMINANT3X3Button;
    private JButton vectorButton;
    private JButton matrixButton;
    private JButton basicMatrixButton;
    private JButton ADDITION3X3Button;
    private JButton DIFFERENCEOFV1ANDButton;
    private JButton TRACEButton;
    private JButton ANGLEBETWEENV1ANDButton;
    private JButton LINEARLYINDEPENDENTButton;
    private JButton TRANPOSEButton;
    private JButton SUBSTARCTION2X2Button;
    private JButton SUBSTRACTION3X3Button;
    private JButton DELETEButton;
    private JButton exitButton;
    private JTextField textField3;
    private JButton MAGNITUDEButton;
    private JLabel answer_1;
    private JLabel answer_4;
    private JLabel answer_7;
    private JLabel answer_2;
    private JLabel answer_5;
    private JLabel answer_8;
    private JLabel answer_3;
    private JLabel answer_6;
    private JLabel answer_9;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField1;
    private JTextField textField2;

    public MCG_Calculator1() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit (0);
            }
        });
        MAGNITUDEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                //Calculate the magnitude
                double magnitude_length = V1 * V2;
                answer_1.setText(String.format("%.02f",magnitude_length));

            }
        });
        SUMOFV1ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                //Calculate the sum of V1 and V2
                double sum_V1 = V1 + V3;
                double sum_V2 = V2 + V4;
                answer_1.setText(String.format("%.02f",sum_V1));
                answer_2.setText(String.format("%.02f",sum_V2));
            }
        });
        SCALARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                //Calculate the sum of V1 and V2
                double scalar_vector = (V1 * V2) + (V3 * V4);
                answer_1.setText(String.format("%.02f",scalar_vector));
            }
        });
        DIFFERENCEOFV1ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                //Calculate the sum of V1 and V2
                double substract_V1 = V1 + V3;
                double substract_V2 = V2 + V4;
                answer_1.setText(String.format("%.02f",substract_V1));
                answer_2.setText(String.format("%.02f",substract_V2));
            }
        });
        ANGLEBETWEENV1ANDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                //Calculate the angle between V1 and V2
                double angle = Math.acos ((V1 * V2)/((Math.sqrt (V1)) * (Math.sqrt (V2))));
                answer_1.setText(String.format("%.02f",angle));
            }
        });
        LINEARLYINDEPENDENTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                //Calculate the linearly dependent
                double linear_dependent = V1 * V2 * V3;
                answer_1.setText(String.format("%.02f",linear_dependent));
            }
        });
        MULTIPLICATION2X2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());

                // Calculate the multiplication of (2x2)
                //row1column1
                double multiply_matrices_1 = (V1*V5)+(V2*V7);
                //row1column2
                double multiply_matrices_2 = (V1*V6)+(V2*V8);
                //row2column1
                double multiply_matrices_3 = (V3*V5)+(V4*V7);
                //row2column2
                double multiply_matrices_4 = (V3*V6)+(V4*V8);

                answer_1.setText(String.format("%.02f",multiply_matrices_1));
                answer_2.setText(String.format("%.02f",multiply_matrices_2));
                answer_3.setText(String.format("%.02f",multiply_matrices_3));
                answer_4.setText(String.format("%.02f",multiply_matrices_4));
            }
        });
        MULTIPLICATION3X3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                Double V10 = Double.parseDouble(textField10.getText());
                Double V11 = Double.parseDouble(textField11.getText());
                Double V12 = Double.parseDouble(textField12.getText());
                Double V13 = Double.parseDouble(textField13.getText());
                Double V14 = Double.parseDouble(textField14.getText());
                Double V15 = Double.parseDouble(textField15.getText());
                Double V16 = Double.parseDouble(textField16.getText());
                Double V17 = Double.parseDouble(textField17.getText());
                Double V18= Double.parseDouble(textField18.getText());
                // Calculate the multiplication of (3x3)
                //row1column1
                double multiplymatrices_1 = (V1*V10)+(V2*V13)+(V3*V16);
                //row1column2
                double multiplymatrices_2 = (V1*V11)+(V2*V14)+(V3*V17);
                //row1column3
                double multiplymatrices_3 = (V1*V12)+(V2*V15)+(V3*V18);
                //row2column1
                double multiplymatrices_4 = (V4*V10)+(V5*V13)+(V6*V16);
                //row2column2
                double multiplymatrices_5 = (V4*V11)+(V5*V14)+(V6*V17);
                //row2column3
                double multiplymatrices_6 = (V4*V12)+(V5*V15)+(V6*V18);
                //row3column1
                double multiplymatrices_7 = (V7*V10)+(V8*V13)+(V9*V16);
                //row3column2
                double multiplymatrices_8 = (V7*V11)+(V8*V14)+(V9*V17);
                //row3column3
                double multiplymatrices_9 = (V7*V12)+(V8*V15)+(V9*V18);

                answer_1.setText(String.format("%.02f",multiplymatrices_1));
                answer_2.setText(String.format("%.02f",multiplymatrices_2));
                answer_3.setText(String.format("%.02f",multiplymatrices_3));
                answer_4.setText(String.format("%.02f",multiplymatrices_4));
                answer_5.setText(String.format("%.02f",multiplymatrices_5));
                answer_6.setText(String.format("%.02f",multiplymatrices_6));
                answer_7.setText(String.format("%.02f",multiplymatrices_7));
                answer_8.setText(String.format("%.02f",multiplymatrices_8));
                answer_9.setText(String.format("%.02f",multiplymatrices_9));
            }
        });
        ADDITION2X2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                // Calculate the add of 2x2
                double add_matrices_1 = (V1+V5);
                //row1column2
                double add_matrices_2 = (V2+V7);
                //row2column1
                double add_matrices_3 = (V3+V6);
                //row2column2
                double add_matrices_4 = (V4+V8);
                answer_1.setText(String.format("%.02f",add_matrices_1));
                answer_2.setText(String.format("%.02f",add_matrices_2));
                answer_3.setText(String.format("%.02f",add_matrices_3));
                answer_4.setText(String.format("%.02f",add_matrices_4));
            }
        });
        ADDITION3X3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                Double V10 = Double.parseDouble(textField10.getText());
                Double V11 = Double.parseDouble(textField11.getText());
                Double V12 = Double.parseDouble(textField12.getText());
                Double V13 = Double.parseDouble(textField13.getText());
                Double V14 = Double.parseDouble(textField14.getText());
                Double V15 = Double.parseDouble(textField15.getText());
                Double V16 = Double.parseDouble(textField16.getText());
                Double V17 = Double.parseDouble(textField17.getText());
                Double V18= Double.parseDouble(textField18.getText());
                //Ca;culate the add matrices of 3x3
                double add_matrices_1 = (V1+V10);
                //row1column2
                double add_matrices_2 = (V2+V11);
                //row2column1
                double add_matrices_3 = (V3+V12);
                //row2column1
                double add_matrices_4 = (V4+V13);
                //row2column2
                double add_matrices_5 = (V5+V14);
                //row2column3
                double add_matrices_6 = (V6+V15);
                //row3column1
                double add_matrices_7 = (V7+V16);
                //row3column2
                double add_matrices_8 = (V8+17);
                //row3column3
                double add_matrices_9 = (V9+V18);
                answer_1.setText(String.format("%.02f",add_matrices_1));
                answer_2.setText(String.format("%.02f",add_matrices_2));
                answer_3.setText(String.format("%.02f",add_matrices_3));
                answer_4.setText(String.format("%.02f",add_matrices_4));
                answer_5.setText(String.format("%.02f",add_matrices_5));
                answer_6.setText(String.format("%.02f",add_matrices_6));
                answer_7.setText(String.format("%.02f",add_matrices_7));
                answer_8.setText(String.format("%.02f",add_matrices_8));
                answer_9.setText(String.format("%.02f",add_matrices_9));
            }
        });
        SUBSTARCTION2X2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                // Calculate the substract of 2x2
                double subs_matrices_1 = (V1-V5);
                //row1column2
                double subs_matrices_2 = (V2-V7);
                //row2column1
                double subs_matrices_3 = (V3-V6);
                //row2column2
                double subs_matrices_4 = (V4-V8);
                answer_1.setText(String.format("%.02f",subs_matrices_1));
                answer_2.setText(String.format("%.02f",subs_matrices_2));
                answer_3.setText(String.format("%.02f",subs_matrices_3));
                answer_4.setText(String.format("%.02f",subs_matrices_4));
            }
        });
        SUBSTRACTION3X3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                Double V10 = Double.parseDouble(textField10.getText());
                Double V11 = Double.parseDouble(textField11.getText());
                Double V12 = Double.parseDouble(textField12.getText());
                Double V13 = Double.parseDouble(textField13.getText());
                Double V14 = Double.parseDouble(textField14.getText());
                Double V15 = Double.parseDouble(textField15.getText());
                Double V16 = Double.parseDouble(textField16.getText());
                Double V17 = Double.parseDouble(textField17.getText());
                Double V18= Double.parseDouble(textField18.getText());
                //Ca;culate the add matrices of 3x3
                double subsmatrices_1 = (V1-V10);
                //row1column2
                double subsmatrices_2 = (V2-V11);
                //row2column1
                double subsmatrices_3 = (V3-V12);
                //row2column1
                double subsmatrices_4 = (V4-V13);
                //row2column2
                double subsmatrices_5 = (V5-V14);
                //row2column3
                double subsmatrices_6 = (V6-V15);
                //row3column1
                double subsmatrices_7 = (V7-V16);
                //row3column2
                double subsmatrices_8 = (V8-17);
                //row3column3
                double subsmatrices_9 = (V9-V18);

                answer_1.setText(String.format("%.02f",subsmatrices_1));
                answer_2.setText(String.format("%.02f",subsmatrices_2));
                answer_3.setText(String.format("%.02f",subsmatrices_3));
                answer_4.setText(String.format("%.02f",subsmatrices_4));
                answer_5.setText(String.format("%.02f",subsmatrices_5));
                answer_6.setText(String.format("%.02f",subsmatrices_6));
                answer_7.setText(String.format("%.02f",subsmatrices_7));
                answer_8.setText(String.format("%.02f",subsmatrices_8));
                answer_9.setText(String.format("%.02f",subsmatrices_9));
            }
        });
        INVERSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                //Calculate the inverse matix
                double inverse_matrices1 = ( 1 / ( V1 * V4 ) - ( V2-V3 )) * (V1);
                double inverse_matrices2 = ( 1 / ( V1 * V4 ) - ( V2-V3 )) * (V2);
                double inverse_matrices3 = ( 1 / ( V1 * V4 ) - ( V2-V3 )) * (V3);
                double inverse_matrices4 = ( 1 / ( V1 * V4 ) - ( V2-V3 )) * (V4);

                answer_1.setText(String.format("%.02f",inverse_matrices1));
                answer_2.setText(String.format("%.02f",inverse_matrices2));
                answer_3.setText(String.format("%.02f",inverse_matrices3));
                answer_4.setText(String.format("%.02f",inverse_matrices4));
            }
        });
        DETERMINANT2X2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                //Calculate the determinant matrix 2x2
                double determinant_matrices = ( V1 * V4 ) + ( V2 * V3 );
                answer_1.setText(String.format("%.02f",determinant_matrices));
            }
        });
        DETERMINANT3X3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                //Calculate the determinant matrix of 3x3
                double determinant_matrices_2 = (V1 * ( (V5*V9) - (V6*V8)) - V2 * ( (V4*V9) - (V6*V7)) - V3 * ( (V4*V8) - (V5*V7)));
                answer_1.setText(String.format("%.02f",determinant_matrices_2));
            }
        });
        TRACEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                //Calculate the trace matrix
                double trace_matrices = V1 + V5 + V9;
                answer_1.setText(String.format("%.02f",trace_matrices));
            }
        });
        TRANPOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double V1 = Double.parseDouble(textField1.getText());
                Double V2 = Double.parseDouble(textField2.getText());
                Double V3 = Double.parseDouble(textField3.getText());
                Double V4 = Double.parseDouble(textField4.getText());
                Double V5 = Double.parseDouble(textField5.getText());
                Double V6 = Double.parseDouble(textField6.getText());
                Double V7 = Double.parseDouble(textField7.getText());
                Double V8 = Double.parseDouble(textField8.getText());
                Double V9 = Double.parseDouble(textField9.getText());
                //Determine the transpose matrix
                //Transpose matrix
                double transpose_matrices1 = V1;
                double transpose_matrices2 = V4;
                double transpose_matrices3 = V7;
                double transpose_matrices4 = V2;
                double transpose_matrices5 = V5;
                double transpose_matrices6 = V6;
                double transpose_matrices7 = V3;
                double transpose_matrices8 = V6;
                double transpose_matrices9 = V9;

                answer_1.setText(String.format("%.02f",transpose_matrices1));
                answer_2.setText(String.format("%.02f",transpose_matrices2));
                answer_3.setText(String.format("%.02f",transpose_matrices3));
                answer_4.setText(String.format("%.02f",transpose_matrices4));
                answer_5.setText(String.format("%.02f",transpose_matrices5));
                answer_6.setText(String.format("%.02f",transpose_matrices6));
                answer_7.setText(String.format("%.02f",transpose_matrices7));
                answer_8.setText(String.format("%.02f",transpose_matrices8));
                answer_9.setText(String.format("%.02f",transpose_matrices9));

            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
                textField7.setText("");
                textField8.setText("");
                textField9.setText("");
                textField10.setText("");
                textField11.setText("");
                textField12.setText("");
                textField13.setText("");
                textField14.setText("");
                textField15.setText("");
                textField16.setText("");
                textField17.setText("");
                textField18.setText("");

                answer_1.setText(" ");
                answer_2.setText(" ");
                answer_3.setText(" ");
                answer_4.setText(" ");
                answer_5.setText(" ");
                answer_6.setText(" ");
                answer_7.setText(" ");
                answer_8.setText(" ");
                answer_9.setText(" ");
            }
        });
    }
    public static void main (String args[] ){
        JFrame frame = new JFrame("Basic CG Calculator");
        frame.setContentPane(new MCG_Calculator1().mainpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

