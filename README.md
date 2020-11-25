# MasterDetailSample
Sample Master Detail Application
Tablet Demo: 


![tablet_gif](https://user-images.githubusercontent.com/32747586/100101043-ef159e00-2e1e-11eb-84e5-9280d083115b.gif)


Phone Demo: 


![phone_gif](https://user-images.githubusercontent.com/32747586/100101056-f50b7f00-2e1e-11eb-85dd-302a159b4b30.gif)



# Overview

The steps to making this application from scratch was relatively simple. The main components are a single base activity to contain the fragments. The initial screen is the list fragment. Notice though that there are two list fragments. One is used if the screen width is over 600 pixels and one is use if not. The one that is used for screen widths of over 600 pixels is the tablet screen and if the screen is larege enough it will automatically use that layout. I named the lists the same so I could reuse components however I could have two seperate recyclerviews (one for phone and another for tablet) if needed. When selected we check to see if we are using a tablet or a phone and based on that we choose where the details of the list will show, whether in the tablet container or the phone container. The phone comtainer will add the fragment to the back stack so the back button will be functional. The tablet has no need for that since all of it is displayed on the same screen.
