public class Data {

    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        if (checkString(login) && checkString(password) && checkString(confirmPassword)) {
            this.login = login;
            this.password = password;
            this.confirmPassword = confirmPassword;
        }
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
        boolean checking;
        if (login.length() < 1 || login.length() > 20) {
            try {
                throw new WrongLoginException("Количество символов в логине неверное!");
            } catch (WrongLoginException e) {
                throw new RuntimeException(e);
            }
        }
        if (password.length() < 1 || password.length() > 20 || confirmPassword.length() < 1 || confirmPassword.length() > 20) {
            try {
                throw new WrongPasswordException("Количество символов в пароле или подтверждении пароля неверное.");
            } catch (WrongPasswordException e) {
                throw new RuntimeException(e);
            }
        }
        if (checkString(login) && checkString(password) && password.equals(confirmPassword)) {
            checking = true;
            System.out.println("Логин, пароль и подтверждение пароля соответствуют всем требованиям.");
        } else {
            if (!checkString(login)) {
                try {
                    throw new WrongLoginException("В логине содержится запрещённый символ.");
                } catch (WrongLoginException e) {
                    throw new RuntimeException(e);
                }
            }
            if (!checkString(password)) {
                try {
                    throw new WrongPasswordException("В пароле содержится запрещённый символ.");
                } catch (WrongPasswordException e) {
                    throw new RuntimeException(e);
                }
            }
            if (!checkString(confirmPassword)) {
                try {
                    throw new WrongPasswordException("В подтверждении пароля содержится запрещённый символ.");
                } catch (WrongPasswordException e) {
                    throw new RuntimeException(e);
                }
            }
            if (!password.equals(confirmPassword)) {
                try {
                    throw new WrongPasswordException("Символы в пароле и подтверждении пароля не совпадают.");
                } catch (WrongPasswordException e) {
                    throw new RuntimeException(e);
                }
            }

            checking = false;
        }
        return checking;
    }

    public static boolean checkString(String text) {
        boolean verify = true;
        int code;
        if (text.length() < 1 || text.length() > 20) {
            verify = false;
        } else {
            for (int i = 0; i < text.length(); i++) {
                code = (int) text.charAt(i);
                if ((code >= 48 && code <= 57) || (code >= 65 && code <= 90) || (code >= 97 && code <= 122) || code == 95) {
                    verify = true;
                } else {
                    verify = false;
                    break;
                }
            }
        }
        return verify;
    }
}

