#include <iostream>

#include <cassert>
#include <cstdint>
#include <string>
#include <vector>

struct A {
    A(int a, int b) {}
    A(const A &) = delete;
    A &operator=(const A &) = delete;
};

int func(int &a, double b) {
    a = 10;

    // ...
    return 0;
}

void func2(const A &a) {}
int main() {
    {
        char a = 117;
        char b = 'f';
        short s = 42;

        printf("Short: %lu bytes\n", sizeof(short));

        int d = 42;
        printf("int: %lu bytes\n", sizeof(int));

        long l = 42;
        printf("long: %lu bytes\n", sizeof(long));

        long long ll = 42;
        printf("long long: %lu bytes\n", sizeof(long long));

        unsigned char e;
        unsigned short es;
        unsigned int ei;
        unsigned long el;
        unsigned long long ell;

        std::uint8_t int8 = 'e';

        char cstr[] = "mystr";

        cstr[2] = 'u';

        printf("%s\n", cstr);

        std::string str = "mystr";

        auto vec = std::vector<int>(15, 42);
        auto vec2 = std::vector<int>{15, 42};

        int aa = 42;
        double bb = 76.4;
        auto i = func(aa, bb);
        assert(aa == 10);

        auto mya = A{15, 42};
        func2(mya);
    }

    int a = 42;

    int *b = 0;

    int &c = a;
}
