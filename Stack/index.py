from clearConsole import clearConsole

stack = []
# PUSH


def addStack(stack, value):
    try:
        if(value != ""):
            stack.append(value)
            print("Element ", value, " Telah ditambahkan")
        else:
            print('Element yang anda inputkan salah!')
    except IndexError:
        print('Perintah tidak dimengerti, coba lagi...')

# POP


def RemoveStack(stack):
    try:
        index = int(len(stack) - 1)
        print(
            f"Menghapus Element teratas pada stack [index:{index}, Element:{stack[index]}]")
        stack.pop(index)
    except IndexError:
        print('Perintah tidak dimengerti, coba lagi...')
# EMPTY


def EMPTY(stack):
    if(len(stack) != 0):
        print("Stack telah di kosongkan...")
        return stack.clear()

# Lihat Isi


def showData(stack):
    clearConsole()
    if(len(stack) != 0):
        print("Mencetak stack")

        print("Element ", end="|")
        for data in stack:
            print(data, end='|')
        print('')

        print("Index ", end="|")
        for index, data in enumerate(stack):
            print(index, end='|')
        print('')
    else:
        print("Stack kosong")
        print("Tidak dapat menampilkan stack\n")

# MENU Program Stack


def menu():
    clearConsole()
    print("=========================")
    print("| Stack Creation Menu |")
    print("=========================")
    print("1. PUSH")
    print("2. POP")
    print("3. EMPTY")
    print("4. SHOW")
    print("5. EXIT")

    pilih_menu = int(input("Pilih Menu : "))

    print("=========================")

    return pilih_menu


def main():
    konfirmasi = True

    while konfirmasi == True:
        # clearConsole()
        pilih_menu = int(menu())

        if (pilih_menu == 1):
            loop = 'y'
            while loop == 'y':
                showData(stack)
                value = input("Masukkan Element: ")
                addStack(stack, value)
                loop = input('Input Lagi [y/n] ? ')
        elif (pilih_menu == 2):
            showData(stack)
            RemoveStack(stack)
        elif (pilih_menu == 3):
            showData(stack)
            EMPTY(stack)
        elif (pilih_menu == 4):
            showData(stack)
        elif (pilih_menu == 5):
            print('Terima kasih telah menggunakan Stack Creation Menu!')
            break
        else:
            print("Kode menu yang anda masukkan salah, coba lagi...")

        input('Tekan ENTER untuk lanjut...')


main()
