# Dizideki Elemanların Ortalamasını Bulan Program

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum / numbers.length);
    }
}
```

### Ödev

Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

#### Harmonik Ortalama formülü : 
    n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri Formülü :

![a](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/pratik-harmonic/figures/harmonic_series.gif)