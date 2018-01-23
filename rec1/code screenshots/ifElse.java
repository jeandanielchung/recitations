

int temperature = 12;
if (temperature < 30) { // if (condition)
	System.out.println("Brr"); // code block to execute if true
} else {
	System.out.println(":)"); // code block to execute if false
}

int temperature = 12;
boolean cold = temperature < 30;
if (cold) { // can use anything that evaluates to a boolean value
	System.out.println("Brr");
} else {
	System.out.println(":)");
}

int temperature = 12;
if (temperature < 30)
	System.out.println("Brr"); // can omit braces ONLY if single statement
else
	System.out.println(":)");


int temperature = 12;
String output = (temperature < 30) ? "Brr" : ":)"; // ternary statement
System.out.println(output);

int temperature = 12;
if (temperature < 30) {
	if (temperature > 100) { // nested if
		System.out.println("Too hot");
	}
} else {
	System.out.println(":)");
}


int temperature = 12;
if (temperature < 30) {
	System.out.println("Brr");
} else if (temperature > 100) { // multi-way if-else (better than nested)
	System.out.println("Too hot");
} else {
	System.out.println(":)");
}
