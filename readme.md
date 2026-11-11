# README – Dictator System med arv og polymorfi
Infinite Loopers:
-Mark
-Niklas

## Hvad projektet går ud på
Et simpelt system til at håndtere diktatorer. Programmet genererer et antal diktatorer (MilitaryDictator, PoliticalDictator, EducationalDictator), som derefter vises og udfører deres handlinger via polymorfi.

## Hvordan programmet er opdelt i metoder

**Leader (abstrakt)**
- Konstruktør
- `giveSpeech()` – abstrakt tale, overrides i subklasserne
- `printDetails()` – viser navn, alder, år ved magten og land

**MilitaryDictator, PoliticalDictator, EducationalDictator**
- Konstruktør
- `giveSpeech()` – hver klasse har sin egen implementation
- `printDetails()` – udvider med klasse-specifikke felter
- Implementerer `PowerActions`

**PowerActions (interface)**
- `implementPolicy()`
- `repressOpposition()`
- `holdParade()`
- `consolidatePower()`

**Main**
- `main()` – starter programmet
- `setupDictators(Scanner)` – spørger hvor mange ekstra diktatorer der skal oprettes
- `generateDictators(int)` – opretter de 3 faste diktatorer plus det valgte antal tilfældige
- `listDictators()` – gennemgår listen og kalder `printDetails()`, `giveSpeech()` og `PowerActions`-metoderne

## Hvorfor denne opdeling
Hver klasse har ét ansvar, mens `Main` styrer de forskellige operationer der skal udføres ift. opgavens krav. 

## Eksempel på en metode med parameter
`generateDictators(int dictatorCount)` tager et antal som parameter og tilføjer det korrekte antal diktatorer til listen `dictators`.

## Eksempel på en metode med returværdi
`Math.random()` returnerer en `double`, som bruges til at vælge en tilfældig diktatortype og til at beregne alder og `yearsInPower`.

## Hvilke løkker bruges, og hvorfor
Vi bruger en `for` løkke i `generateDictators` til at oprette det ønskede antal diktatorer, og en `for each` i `listDictators` til at kalde metoderne på hvert objekt. 

## Ting vi har testet
- At alle tre diktatortyper oprettes korrekt
- At polymorfi virker, da `giveSpeech()` giver forskelligt output pr. klasse
- At `instanceof PowerActions` kalder de korrekte handlinger
- At ugyldigt input (uden for 0-6) håndteres med en fejlbesked og fornyet prompt

## En fejl eller udfordring vi stødte på
Det var lidt en udfordring at bruge `instanceof` på en måde der stadig gav mening når alle subklasser implementerer `PowerActions`. Men ved at caste, kan vi i det mindste sikre at handlingerne kun kaldes på objekter, der rent faktisk understøtter dem.

## Hvad vi har lært om klasser
At abstrakte klasser og interfaces kan kombineres, for at skabe fleksible løsninger og mere unikke systemer der afspejler den virkelige verden.
