package software.ulpgc.kata3;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static Histogram histogram() {
        return new Histogram() {
            @Override
            public int bins() {
                return 5;
            }

            @Override
            public double[] values() {
                return new double[] { 1, 2, 5, 3, 4, 7, 9, 4, 6, 9, 7, 4, 3, 9, 7, 5, 6};
            }
        };
    }
}
