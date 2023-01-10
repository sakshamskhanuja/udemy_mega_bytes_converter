## MegaBytes Converter

### Description

Write a method called <b>printMegaBytesAndKiloBytes</b> that has 1 parameter of type <b>int</b> with the name <b>kiloBytes</b>. The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter. Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

XX represents the original value kiloBytes.<br>
YY represents the calculated megabytes.<br>
ZZ represents the calculated remaining kilobytes.

If the parameter kiloBytes is less than 0 then print the text "Invalid Value".

### Examples of input/output

<ul>
<li>printMegaBytesAndKiloBytes(2500); → "2500 KB = 2 MB and 452 KB"</li>
<li>printMegaBytesAndKiloBytes(-1024); → "Invalid Value" because parameter is less than 0.</li>
<li>printMegaBytesAndKiloBytes(5000); → "5000 KB = 4 MB and 904 KB"</li>
</ul>
