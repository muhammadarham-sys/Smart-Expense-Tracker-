package utils;

public class Constants {

    // ================= APP INFO =================
    public static final String APP_NAME = "Smart Expense Tracker";

    // ================= LOGIN DEFAULTS (DEMO) =================
    public static final String DEFAULT_USERNAME = "admin";
    public static final String DEFAULT_PASSWORD = "1234";

    // ================= FILE STORAGE =================
    public static final String USER_FILE = "user.dat";
    public static final String EXPENSE_FILE = "expenses.dat";
    public static final String BUDGET_FILE = "budget.dat";

    // ================= MESSAGES =================
    public static final String LOGIN_SUCCESS = "Login Successful!";
    public static final String LOGIN_FAILED = "Invalid username or password.";

    public static final String EXPENSE_ADDED = "Expense added successfully!";
    public static final String INVALID_AMOUNT = "Amount must be greater than 0.";

    public static final String DATA_SAVED = "Data saved successfully!";
    public static final String DATA_LOADED = "Data loaded successfully!";

    // ================= DEFAULT VALUES =================
    public static final double DEFAULT_BUDGET_LIMIT = 10000.0;

    // ================= UI CONSTANTS =================
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 300;

    private Constants() {
        // prevent instantiation
    }
}