# Wi-Fi Connector: WICON(Android)
## Description
> WiFi 안내문을 스캔하여 얻은 안내문 속 텍스트의 ID,Password를 자동으로 입력하여 <br>
> 사용자가 WiFi 정보를 입력할 필요없이 자동으로 WiFi 연결해주는 App

## Function
1. WiFi 자동연결
2. WiFi 안내문 스캔
3. 앨범에 있는 사진(안내문) 스캔

## Tech Stack
![tech](https://user-images.githubusercontent.com/57867611/116843395-cccc4b80-ac1a-11eb-82fc-7341fc3686f1.png)

## 시스템 흐름도
<img width="614" alt="flow" src="https://user-images.githubusercontent.com/57867611/116843176-14060c80-ac1a-11eb-9c9d-3cf57325f816.png">

## 실행화면
<img width="620" alt="screen" src="https://user-images.githubusercontent.com/57867611/116843179-16686680-ac1a-11eb-98a3-c63241d4fa67.png">

## Algorithm
1. Google Cloud Vision API를 사용해 WiFi 안내문 속 Text 추출
2. 현재 연결가능한 WiFi 리스트 Load
3. 추출된 Text중 WiFi 리스트와 일치한 항목이 있을 경우 -> ID로 인식
4. ID로 인식된 Text 바로 밑에 Text를 Password로 인식
5. 결정된 ID와 Password로 WiFi 자동연결 

## API
```
Google Cloud Vision API
```

## How to Use?
```
1. WICON/app/build.gradle Line20: Input Your API key
2. WICON/app/src/main/java/com/chalkag/WICON Line67:Input Your API key
```
