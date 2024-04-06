import os

def clear_screen():
    # Membersihkan layar terminal
    os.system('cls' if os.name == 'nt' else 'clear')

def caesar_cipher(text, shift, decrypt=False):
    result = ""
    for char in text:
        # Periksa apakah karakter adalah huruf
        if char.isalpha():
            # Tentukan apakah karakter adalah huruf besar atau kecil
            if char.isupper():
                if decrypt:
                    result += chr((ord(char) - 65 - shift) % 26 + 65)
                else:
                    result += chr((ord(char) - 65 + shift) % 26 + 65)
            else:
                if decrypt:
                    result += chr((ord(char) - 97 - shift) % 26 + 97)
                else:
                    result += chr((ord(char) - 97 + shift) % 26 + 97)
        else:
            # Jika bukan huruf, biarkan karakter tersebut tidak berubah
            result += char
    return result

def autokey_cipher(text, keyword, decrypt=False):
    result = ""
    keyword_index = 0
    for char in text:
        # Periksa apakah karakter adalah huruf
        if char.isalpha():
            # Tentukan apakah karakter adalah huruf besar atau kecil
            if char.isupper():
                if decrypt:
                    result += chr((ord(char) - ord(keyword[keyword_index].upper())) % 26 + 65)
                else:
                    result += chr((ord(char) + ord(keyword[keyword_index].upper()) - 2 * 65) % 26 + 65)
            else:
                if decrypt:
                    result += chr((ord(char) - ord(keyword[keyword_index].lower())) % 26 + 97)
                else:
                    result += chr((ord(char) + ord(keyword[keyword_index].lower()) - 2 * 97) % 26 + 97)
            keyword_index += 1
            if keyword_index == len(keyword):
                keyword_index = 0
        else:
            # Jika bukan huruf, biarkan karakter tersebut tidak berubah
            result += char
    return result

def main():
    print("Selamat Datang di aplikasi dencrypt!")
    print("Silahkan masukkan input anda sesuai intruksi")
    print("==============================================")
    while True:
        try:
            choice = input("(A)utokey Cipher\n(C)aesar Cipher\nTentukan algoritma kriptografi anda dari dua opsi diatas (A/C): ").lower()

            if choice == "a":
                clear_screen()
                print("Algoritma yang anda pilih adalah Autokey Cipher...")
                mode = input("Apakah anda ingin (e)kripsi atau (d)ekripsi? ").lower()
                if mode == "e":
                    keyword = input("Masukkan kunci (kata kunci yang akan digunakan): ")
                    text = input("Inputkan kata yang ingin anda enkripsi: ")
                    encrypted_text = autokey_cipher(text, keyword)
                    print("Teks terenkripsi:", encrypted_text)
                elif mode == "d":
                    keyword = input("Masukkan kunci (kata kunci yang akan digunakan): ")
                    text = input("Inputkan kata yang ingin anda dekripsi: ")
                    decrypted_text = autokey_cipher(text, keyword, decrypt=True)
                    print("Teks terdekripsi:", decrypted_text)
                else:
                    print("Input tidak dikenal, harap masukkan 'e' atau 'd'...")
            elif choice == "c":
                clear_screen()
                print("Algoritma yang anda pilih adalah Caesar Cipher...")
                mode = input("Apakah anda ingin (e)kripsi atau (d)ekripsi? ").lower()
                if mode == "e":
                    shift = int(input("Masukkan jumlah pergeseran (bilangan bulat: 0-25): "))
                    text = input("Inputkan kata yang ingin anda enkripsi: ")
                    encrypted_text = caesar_cipher(text, shift)
                    print("Teks terenkripsi:", encrypted_text)
                elif mode == "d":
                    shift = int(input("Masukkan jumlah pergeseran (bilangan bulat: 0-25): "))
                    text = input("Inputkan kata yang ingin anda dekripsi: ")
                    decrypted_text = caesar_cipher(text, shift, decrypt=True)
                    print("Teks terdekripsi:", decrypted_text)
                else:
                    print("Input tidak dikenal, harap masukkan 'e' atau 'd'...")
            else:
                print("Input tidak dikenal, harap masukkan 'A' atau 'C'...")

            # Konfirmasi untuk melanjutkan atau menutup program
            response = input("Apakah Anda ingin melanjutkan (y/n)? ").lower()
            if response != "y":
                print("Terima kasih telah menggunakan program dencrypt!")
                break
        except ValueError:
            print("Input tidak valid, harap masukkan bilangan bulat untuk jumlah pergeseran.")

if __name__ == "__main__":
    main()
