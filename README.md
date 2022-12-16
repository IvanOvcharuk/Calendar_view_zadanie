# Calendar_view_zadanie

Projekt opierający się na stworzeniu aplikacji i użuciu w niej funkcji CalendarView

Funkcjonalność:
1. Ustawienia daty wyjazdu i powrotu.
2. Obliczanie ilosc dni
3. Blokada wyjazdu w przeszłość
4. Blokada wyjazdu w daleką przyszłość(nie więcej niż 2 lata)
5*.Zaznaczenie zakresu dni wyjazdu na kalendarzu 

1.Niezawodnosc
- po uruchomieniu programu otwiera sie aplikacja pod nazwa 'Calendar_View_zadanie'
- zadne inne okna nie otwieraja sie na pierwszy plan, aplikacja sklada sie tylko z jednej strony
- zatrzymanie dzialania wykonuje w sposob zamykania aplikacji krzyzykiem na gorze aplikacji
- ponowne przejscie do funkcjonalnosci aplikacji powoduje zresetowania wszystkich wczesniejszych danych
- aplikacja nie jest zbyt skomplikowana i nie potrzebuje duzo pamieci do jej obslugi. Rowniez aplikacja nie posiada zadnych priorytetow
- 'zabiecie aplikacji' powoduje zresetowania wszystkich w niej zapisywanych danych, takich jak date odjazdu i date powrotu
- aplikacja nie posiada dzialan koncowych, poprostu sie zamyka i wraca do pulpitu

2.Funkconalnosc
- Po uruchomieniu programu pojawia sie kalendarz z 2 przyciskami na dole.
- Automatycznie zostają zablokowane wyjazdy w przeszłość, czy daleką przyszlość, która stanowi więcej niz dwa lata
- Użytkownik powinien zaznaczyć na kalendarzu datę wyjazdu i kliknąć przycisk z napisem "Wyjazd"
- Program zapamiętuje date wyjazdu i wyświetla napis nad klikniętym przyciskiem (date wyjazdu)
- Kolejnym etapem jest wybranie datę powrotu na kalendarzu i kliknąć przycisk "Powrót"
- Program zapamiętuje date powrotu i wyświetla napis nad klikniętym przyciskiem (date powrotu)
- Uzytkownik nie moze zaznaczyc date powrotu wczesniejsza niz date odjazdu, zostanie wyswietlony napis "Nie możesz wyjechać później niż wrócisz!"
- Natomiast po  wybraniu odpowiedniej daty odjazdu i daty powrotu wyswietla sie ilosc dni podrozy
- Po zamknięciu programu aplikacja automatycznie się wyzerowuje i wszystkie dane znikają

Weryfikacja i testowanie:

- Podczas testowania, aplikacja uniemozliwia wybrania daty z przeszlosci, czy dalekiej przyszlosci (wiecej niz 2 lata)
- Po wybraniu daty odjazdu i klikniecia przycisku 'Odjazd' zostaje wyswietlona data odjazdu np.'Odjazd: 2022-12-16'
- Po wybraniu daty powrotu i klikniecia przycisku 'Powrot' zostaje wyswietlona data powrotu np. 'Powrot: 2022-12-22'
- I wyswietlaja sie dni w podrozy np 'Ilosc dni: 6'
- Jezeli uzytkownik wybierze date powrotu najpierw np. 'Powrot: 2022-12-16'
- A date odjazdu pozniej np. 'Odjazd: 2022-12-22' to program wypisze mu 'Nie możesz wyjechać później niż wrócisz!'
