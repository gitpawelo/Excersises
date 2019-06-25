Utwórz klasę IpFinderTest, mającą dwie metody - public boolean hasIp(String text) oraz public boolean getIp(String text)
    - Adres IP jest reprezentowany przez 3 liczby, co najmniej jednocyfrowe i co najwyżej trzycyfrowe, oddzielone kropką, np:
        a) "192.168.78.23"
        b) "10.155.10.12"
        c) "2.2.1.1"
    - Dla ułatwienia załóżmy, że mogą być to dowolne cyfry od 0 do 9 (czyli w naszej wersji adres IP "999.999.000.1" będzie
    poprawny (choć tak naprawdę nie jest))
    - Metody powinny używać wyrażenia regularnego
    - Kropka to w wyrażeniach regularnych znak specjalny, dlatego w regeksie trzeba użyć podwójnego eskejpowania: "\\."
    - Przykład użycia znajdziesz w projekcie maven_test na dropboksie. Dodaj test dla klasy IpFinderTest - przetestuj obie
    metody dla danych testowych:
        a) "Serwer gry dostępny jest pod adresem 10.234.20.90 - miłej zabawy!"
        b) "Adres domeny mojafirma.com to 23.340.45.900"
        c) "Współrzędne to 90.3454 stopnie na północ"
        d) "Tu nie ma nawet żadnych cyfr!"
