class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        //比较行数和字符串长度，并给每行添加一个StringBuilder存放每行元素
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        //每行的字符个数
        int curRow = 0;
        boolean goingDown = false;
        //取字符串中的每个字符
        for (char c : s.toCharArray()) {
            //在当前行数添加字符
            rows.get(curRow).append(c);
            //第一行或最后一行，将godown反置
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            //godown 向下则行数加一，向上则行数减一
            curRow += goingDown ? 1 : -1;
        }
        //将各行的字符串取出
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }
}