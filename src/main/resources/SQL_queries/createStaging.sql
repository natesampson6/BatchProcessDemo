USE [BatchProcessorExample]
GO

/****** Object:  Table [dbo].[staging_input]    Script Date: 7/15/2020 8:00:34 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[staging_input](
	[IPT_STG_PK] [int] NOT NULL,
	[LST_NME] [varchar](50) NULL,
	[FST_NME] [varchar](50) NULL,
	[AGE] [int] NULL,
	[PCT_GRD] [varchar](5) NULL,
PRIMARY KEY CLUSTERED 
(
	[IPT_STG_PK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


