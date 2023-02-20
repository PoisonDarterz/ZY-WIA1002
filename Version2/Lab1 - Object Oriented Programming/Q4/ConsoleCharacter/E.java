package Lab1.Q4.ConsoleCharacter;

public class E extends ConsoleCharacter {
	public boolean[][] getUppercase() {
		int column = 3;
		boolean[][] buff = getBuff(column + 2);
		plotVerticalLine(buff, 0, ROW - 1, 1);
		plotHorizontalLines(buff, 2, 3, new int[] {0, 2, 4});
		return buff;
	}

	public boolean[][] getLowercase() {
		int column = 4;
		boolean[][] buff = getBuff(column + 2);
		plotHorizontalLine(buff, 1, 4, 2);
		plotHorizontalLine(buff, 2, 4, 4);
		buff[0][2] = buff[0][3] = buff[1][1] = buff[1][4] = buff[3][1] = true;
		return buff;
	}
}
