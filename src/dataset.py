pip install kaggle

import kagglehub

# Download latest version
path = kagglehub.dataset_download("paultimothymooney/recipenlg")

print("Path to dataset files:", path)


#Note to group: these are the links for setup, I have a token for the API but genuinely don't understand github/python enough for this
#https://github.com/Kaggle/kagglehub/blob/main/README.md#download-dataset
#https://www.kaggle.com/docs/api#authentication
#https://www.kaggle.com/datasets/paultimothymooney/recipenlg/data
