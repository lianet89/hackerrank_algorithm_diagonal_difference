package hackerrank_algorithm_diagonal_difference;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int diagonal1 = 0;
		int diagonal2 = 0;
		int i = 0;
		int j = 0;

		while (i < arr.size() && j < arr.size()) {
			j = i;
			if (-100 <= arr.get(i).get(j) && arr.get(i).get(j) <= 100) {
				diagonal1 += arr.get(i).get(j);
				i++;
			}
		}

		j = arr.size() - 1;
		i = 0;
		while (i < arr.size() && j >= 0) {
			if (-100 <= arr.get(i).get(j) && arr.get(i).get(j) <= 100) {
				diagonal2 += arr.get(i).get(j);
				j--;
				i++;
			}
		}
		int diff = diagonal1 - diagonal2;

		return Math.abs(diff);

	}

}
