pip install kaggle

import kagglehub

# Download latest version
path = kagglehub.dataset_download("thedevastator/better-recipes-for-a-better-life")

print("Path to dataset files:", path)

#https://github.com/Kaggle/kagglehub/blob/main/README.md#download-dataset
#https://www.kaggle.com/docs/api#authentication
#https://www.kaggle.com/datasets/paultimothymooney/recipenlg/data
