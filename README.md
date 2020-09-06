# aws-lamdba-sandbox

AWS Lamdba の砂場  
SBT assembly で jar を生成し、AWS lamdba にアップロードして実行します  

AWS の仕様により、ファイルサイズ 20MB を超える  
jar ファイルは s3 経由であげる必要があります

サブプロジェクトで scala, java で分けているので、  
jar の生成はそれぞれで分けられます。  

## jar 生成  
jar の生成は sbt assembly を使って行います。  
sbt plugin で入れてますので、以下のコマンドで生成します。  
```
> sbt assembly
```

### scala のパッケージ
```
> sbt scala-sample/assembly
```

### java のパッケージ  
```
> sbt sjava-sample/assembly
```
