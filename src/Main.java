//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        String text = "მარიამი";
        String vowels = "აეიოუ";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);

        if (vowels.indexOf(ch) != -1) {
        count++;
        }
        }

        System.out.println("ხმოვნების რაოდენობა: " + count);
        }
