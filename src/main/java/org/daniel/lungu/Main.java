package org.daniel.lungu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.daniel.lungu.operation.InputTypes;
import org.daniel.lungu.operation.Operation;
import org.daniel.lungu.operation.OperationFactoryProvider;
import org.daniel.lungu.operation.Operations;

/**
 * org.daniel.lungu.Main class.
 *
 * @author KNIME GmbH
 */
public class Main {

	private static final Integer INPUT_INDEX = 1;
	private static final Integer INPUT_TYPE_INDEX = 3;
	private static final Integer OPERATIONS_INDEX = 5;
	private static final Integer THREADS_INDEX = 7; // TODO: make the application multi-threading
	private static final Integer OUTPUT_INDEX = 9;

	public static void main(String[] args) throws IOException {
		// add your code here

		File file = new File(args[INPUT_INDEX]);
		InputTypes inputType = InputTypes.fromString(args[INPUT_TYPE_INDEX]);
		List<Operation> operations = getOperations(args[OPERATIONS_INDEX], inputType);
		PrintStream originalStdout = System.out;

		if (args.length > OUTPUT_INDEX) {
			PrintStream out = new PrintStream(new FileOutputStream(args[OUTPUT_INDEX]));
			System.setOut(out);
		}

		processFile(file, operations);

		System.setOut(originalStdout);

		// DO NOT CHANGE THE FOLLOWING LINES OF CODE
		System.out.println(String.format("Processed %d lines (%d of which were unique)", //
				Statistics.getInstance().getNoOfLinesRead(), //
				Statistics.getInstance().getNoOfUniqueLines()));
	}

	private static List<Operation> getOperations(String stringOperations, InputTypes inputType) {
		List<Operation> operations = new ArrayList<>();

		for (String operationString : stringOperations.split(",")) {
			Operations operation = Operations.fromString(operationString);
			operations.add(OperationFactoryProvider.getOperation(inputType, operation));
		}

		return operations;
	}

	private static void processFile(File file, List<Operation> operations) throws FileNotFoundException {
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String st = sc.nextLine();
			Statistics.getInstance().updateStatisticsWithLine(st);

			for (Operation operation : operations) {
				st = operation.handel(st);
			}

			System.out.println(st);
		}
	}

}
