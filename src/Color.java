public enum Color {
    BLACK("black"),
            WHITE("white"),
            YELLOW("yellow"),
            BLUE("blue");




    private String colorName;

    private Color(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }



}

