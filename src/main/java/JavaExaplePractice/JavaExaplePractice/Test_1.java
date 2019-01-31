package JavaExaplePractice.JavaExaplePractice;

import java.io.File;

public class Test_1 {
	public static void main(String[] args) {

		String filePath = "\\\\datacenter\\itroot\\app\\INT1\\SLZ\\MIO\\20181217-0750-4508-8395-DC698F7FC247";
		String linuxPath = "/mnt/slzshareint1/";
		filePath = filePath.replace("\\", "/");
		String indexString = "SLZ";
		if (!filePath.contains(indexString)) {
			indexString = "slz";
		}
		String result1 = filePath.substring(filePath.indexOf(indexString) + 3, filePath.length());
		String inputPath = linuxPath + result1;
		System.out.println(inputPath);

	}
}
