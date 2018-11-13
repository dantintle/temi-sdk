# “Hello World” temi Skill
In this lesson you will create “Hello World” temi Skill. You will learn how to interact with temi through Robot object and you will discover how to utilize essential temi feature: Speech.

1. Open **MainActivity** file and add the **sayHello()** method definition as below:
```
private void sayHello() {
	TtsRequest ttsRequest = TtsRequest.create(“Hello World!”, false);
	Robot.getInstance().speak(ttsRequest);
}
```

2. Call **sayHello()** method in **onCreate()** method:
```
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	sayHello();
}
```

3. Run your skill. You should hear temi says “Hello World!”.

## Summary
In this lesson you created classic “Hello World” project. You have build minimalistic temi Skill and you learned how to interact with temi through Robot object. Get familiar with the API Reference to discover what else you can do with temi.